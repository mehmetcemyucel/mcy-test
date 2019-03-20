package com.mcy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AssertJComplexList {

	@Test
	public void test() {
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(	1,
								"Cem1"));
		itemList.add(new Item(	2,
								"Cem2"));
		itemList.add(new Item(	3,
								"Cem3"));

		assertThat(itemList).extracting("name")
							.contains("Cem1", "Cem3");

		assertThat(itemList).extracting("name", "id")
							.contains(tuple("Cem1", 1), tuple("Cem3", 3));
	}

	static class Item {
		private Integer id;
		private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Item(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

	}

}
