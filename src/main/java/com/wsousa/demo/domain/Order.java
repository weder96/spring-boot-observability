package com.wsousa.demo.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.util.Assert;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private @NotNull @Valid Purchase purchase;

	@ElementCollection
	private @Size(min = 1) Set<ItemOrder> itens = new HashSet<>();

	public Order(@NotNull @Valid Purchase purchase,
                 @Size(min = 1) Set<ItemOrder> itens) {
		Assert.isTrue(itens.iterator().hasNext(),
				"todo pedido deve ter pelo menos um item");
		this.purchase = purchase;
		this.itens.addAll(itens);
	}

	public Order() {

	}

	public boolean totalIgual(@Positive @NotNull BigDecimal valor) {
		return total().setScale(2).equals(valor.setScale(2));
	}

	@Override
	public String toString() {
		return "Pedido [itens=" + itens + "]";
	}

	public BigDecimal total() {
		return itens.stream().map(ItemOrder::total).reduce(BigDecimal.ZERO,
				(atual, proximo) -> atual.add(proximo));
	}

}
