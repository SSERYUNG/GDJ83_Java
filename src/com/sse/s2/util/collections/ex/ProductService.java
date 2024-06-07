package com.sse.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	private StringBuffer sb;
	private Scanner sc;

	public ProductService() {
		this.sb = new StringBuffer();
		this.sb.append("50000, 킹다, 50,");
		this.sb.append("45000, 3왜, 100,");
		this.sb.append("30000, 6여, 20");
		sc = new Scanner(System.in);
	}

	public ArrayList<ProductDTO> init() {
		String pl = this.sb.toString();
		StringTokenizer st = new StringTokenizer(pl, ",");
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();

		while (st.hasMoreTokens()) {

			ProductDTO pdto = new ProductDTO();

			pdto.setPrice(Integer.parseInt(st.nextToken().trim()));
			pdto.setName(st.nextToken().trim());
			pdto.setStock(Integer.parseInt(st.nextToken().trim()));

			ar.add(pdto);
		}
		return ar;
	}

//	기존의 가방에 새상품을 입력받아서 추가
	public void addProduct(ArrayList<ProductDTO> ar) {
		System.out.println("가격을 입력하세요");
		Integer ga = sc.nextInt();
		System.out.println("상품명을 입력하세요");
		String sang = sc.next();
		System.out.println("재고를 입력하세요");
		Integer je = sc.nextInt();

		ProductDTO pdto = new ProductDTO();
		pdto.setPrice(ga);
		pdto.setName(sang);
		pdto.setStock(je);

		ar.add(pdto);

	}

//	기존의 가방을 받아서, 물건의 이름을 입력받아서, 이 물건과 일치하는 제품이 있다면 삭제

	public int removeProduct(ArrayList<ProductDTO> ar) {
		System.out.println("삭제할 제품명을 입력하세요");
		String sak = sc.next();
		int result = 0;

		for (int i = 0; i < ar.size(); i++) {

			if (sak.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;

				break;
			}

		}
		return result;
	}

}