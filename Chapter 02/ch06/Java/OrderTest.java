package ch06;

public class OrderTest {

	public static void main(String[] args) {
		Order first = new Order();
		
		first.ordernumber = "202109150003";
		first.phonenumber = "01012345678";
		first.homeaddress = "부산광역시 강서구 가락대로 1393";
		first.day = 20210915;
		first.time = 130258;
		first.cost = 18000;
		first.name = "알싸한 마늘치킨";
		first.number = 0003;
		
		first.showOrderInfo();
	}

}
