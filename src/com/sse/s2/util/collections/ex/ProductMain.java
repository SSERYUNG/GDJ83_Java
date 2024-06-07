package com.sse.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {

		ProductService ps = new ProductService();
		ArrayList<ProductDTO> pdlist = ps.init();
		ps.addProduct(pdlist);

		System.out.println("가격\t상품명\t재고");
		System.out.println("====================");

		for (int i = 0; i < pdlist.size(); i++) {

			System.out.println(
					pdlist.get(i).getPrice() + "\t" + pdlist.get(i).getName() + "\t" + pdlist.get(i).getStock());
		}

		int result = ps.removeProduct(pdlist);
		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

		System.out.println("가격\t상품명\t재고");
		System.out.println("====================");
		for (int i = 0; i < pdlist.size(); i++) {

			System.out.println(
					pdlist.get(i).getPrice() + "\t" + pdlist.get(i).getName() + "\t" + pdlist.get(i).getStock());
		}

	}

}
