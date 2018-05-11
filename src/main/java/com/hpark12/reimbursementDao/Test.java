package com.hpark12.reimbursementDao;

public class Test {

    public static void main(String[] args) {

//        User user = ReimbursementService.loginUser("Batman@gmail.com", "Gotham");
//
//        //System.out.println(ReimbursementService.addReimbursement(user, 100000, "Batarangs"));
//
//        System.out.println(ReimbursementService.viewPending(user));
//
//        String test = ReimbursementService.viewAllPending(user).toString();
//
//        System.out.println(test);
        int num = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                if (num == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
            }
            System.out.println();
        }


    }

}
