package Shop;

import java.util.Iterator;
import java.util.Scanner;

public class Start {

    public Start(Car car) {

        Table table = new Table();


        Scanner in = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("请选择您要进行的操作");
            System.out.println("1.继续购买   2.删除订单商品    3.修改订单商品   4.查看已买商品     5.订单结算");
            int option = in.nextInt();
            switch (option) {
                case 1:
                   String ad = null;
                    case1:

                    while (true) {
                        System.out.println("请输入您要购买的商品编号");
                        ad = in.next();
                        for (int i = 0; i < table.st.length; i++) {
                            if (!ad.equals(table.st[i].getId())) {
                                System.out.println("您输入的商品编号不正确");
                                break ;
                            }else{
                                break case1;
                            }
                        }
                    }

                    System.out.println("请输入您要购买的商品件数");
                    int adNum = in.nextInt();
                    for (int i = 0; i < table.st.length; i++) {
                        if (ad.equals(table.st[i].getId())) {
                            car.add(table.st[i], adNum);
                        }
                    }
                    break;

                case 2:
                    System.out.println("请输入您要删除的商品编号");
                    String de = in.next();
                    System.out.println("请输入您要删除的商品件数");
                    int deNum = in.nextInt();
                    for (int i = 0; i < table.st.length; i++) {
                        if (de.equals(table.st[i].getId())) {
                            car.delete(table.st[i], deNum);
                        }
                    }
                    break;
                case 3:
                    System.out.println("请输入您要修改的商品编号");
                    String ch = in.next();
                    System.out.println("请输入您要修改的商品件数");
                    int chNum = in.nextInt();
                    for (int i = 0; i < table.st.length; i++) {
                        if (ch.equals(table.st[i].getId())) {
                            car.change(table.st[i], chNum);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < car.getAl().size(); i++) {
                        System.out.println(car.getAl().get(i).getName() + "\t" + "件数" + "*" + car.getAl().get(i).getCount()
                                + "\t" + "单项总价\t" + car.getAl().get(i).getCount() * car.getAl().get(i).getPrice());
                    }
                    break;
                case 5:

                    break loop;
            }

        }

    }
}
