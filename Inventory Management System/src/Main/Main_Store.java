package Main;

import java.util.Scanner;

import Bean.StoreInfo;
import Controller.StoreImplementation;

public class Main_Store {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StoreImplementation st = new StoreImplementation();
		StoreInfo si = new StoreInfo();
		char ch = 0;
		do {

			System.out.println(
					"1.Add Invantory Product\n2.Remove  product \n3.Update  Product\n4.Search Inventory Product\n5.Display Product\n6.Search By Category\n7.Display Total Value of product");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				st.add_new_product(si);

				break;
			case 2:
				st.remove_product(choice);

				break;
			case 3:
				st.update_product_stock(choice);

				break;
			case 4:
				st.search_product(null);

				break;
			case 5:
				st.Display_allproduct_list();

				break;
			case 6:
				st.search_by_type(null);

				break;
			case 7:
				st.display_total_valueof_product(ch, choice);

				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do You Want To Continue ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("thank you........................");

	}

}
