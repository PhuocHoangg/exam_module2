package FinalTest;

import FinalTest.Controller.ForeignPhoneController;
import FinalTest.Controller.LocalPhoneController;

import java.util.Scanner;

    public class view {
        private static int choose;
        private static final Scanner sc = new Scanner(System.in);
        private static final ForeignPhoneController foreignPhoneController = new ForeignPhoneController();
        private static final LocalPhoneController localPhoneController = new LocalPhoneController();

        public void displayMenu1() {
            do {
                System.out.println("------MANAGER------ \n" +
                        "1.\tForeign Phone.\n" +
                        "2.\tLocal Phone.\n" +
                        "3.\tExit.\n" +
                        "---Choose the task: ");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        displayForeignPhoneMenu();
                        break;
                    case 2:
                        displayLocalPhoneMenu();

                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Nhập lại mục cần chọn!");
                }
            } while (true);
        }

        public void displayForeignPhoneMenu() {
            int choose;
            do {
                System.out.println("\n" +
                        "------Phone Manger------\n" +
                        "1.  Show list of Foreign Phone\n" +
                        "2.  Add Foreign Phone\n" +
                        "3.  Delete Foreign Phone By ID\n" +
                        "4.  Find Used Phone By Code\n" +
                        "5.  Exit\n" +
                        "-----");
                System.out.println("Choose function:");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        foreignPhoneController.getAllForeignPhones();
                        break;
                    case 2:
                        foreignPhoneController.addForeignPhone();
                        break;
                    case 3:
                        foreignPhoneController.deleteForeignPhone();
                        break;
                    case 4:
                        foreignPhoneController.getForeignPhoneById();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Enter Wrong Number");
                }
            } while (true);
        }

        public void displayLocalPhoneMenu() {
            int choose;
            do {
                System.out.println("\n" +
                        "------Phone Manager------\n" +
                        "1.  Show list of Local Phone\n" +
                        "2.  Add Local Phone\n" +
                        "3.  Delete Local Phone By ID\n" +
                        "4.  Find New Phone By ID\n" +
                        "5.  Exit\n" +
                        "-----");
                System.out.println("Choose function:");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        localPhoneController.getAllLocalPhones();
                        break;
                    case 2:
                        localPhoneController.addLocalPhone();
                        break;
                    case 3:
                        localPhoneController.deleteLocalPhone();
                        break;
                    case 4:
                        localPhoneController.getLocalPhoneById();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Enter Wrong Number");
                }
            } while (true);

        }
        public static void main(String[] args) {
            view view = new view();
            view.displayMenu1();
        }
    }


