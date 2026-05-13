package com.stu.vehicle_management.presentation;

import com.stu.vehicle_management.model.Car;
import com.stu.vehicle_management.model.Motorcycle;
import com.stu.vehicle_management.model.Truck;
import com.stu.vehicle_management.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Vehicle> listVehicle = new ArrayList<>();

        boolean running = true;

        while (running) {

            showMenu();

            System.out.print("Chọn chức năng: ");
            int choose = scanner.nextInt();

            switch (choose) {

                case 1: {

                    if (listVehicle.isEmpty()) {

                        Vehicle v1 = new Car("Toyota", 2020, "Gasoline");
                        Vehicle v2 = new Motorcycle("Honda", 2018, "Gasoline");
                        Vehicle v3 = new Truck("Volvo", 2022, "Diesel");

                        listVehicle.add(v1);
                        listVehicle.add(v2);
                        listVehicle.add(v3);
                    }

                    System.out.println("\n--- THÔNG TIN PHƯƠNG TIỆN ---");

                    for (Vehicle vehicle : listVehicle) {
                        vehicle.showInfo();
                        System.out.println();
                    }

                    break;
                }

                case 2: {

                    if (listVehicle.isEmpty()) {
                        System.out.println("Vui lòng tạo phương tiện trước!");
                        break;
                    }

                    System.out.println("\n--- OVERRIDING: startEngine() ---");

                    for (Vehicle vehicle : listVehicle) {
                        vehicle.startEngine();
                    }

                    break;
                }

                case 3: {

                    if (listVehicle.isEmpty()) {
                        System.out.println("Vui lòng tạo phương tiện trước!");
                        break;
                    }

                    System.out.println("\n--- OVERLOADING: move() ---");

                    for (Vehicle vehicle : listVehicle) {
                        vehicle.move();
                        vehicle.move(80);
                    }

                    break;
                }

                case 4: {

                    if (listVehicle.isEmpty()) {
                        System.out.println("Vui lòng tạo phương tiện trước!");
                        break;
                    }

                    System.out.println("\n--- POLYMORPHISM RUNTIME ---");

                    for (Vehicle vehicle : listVehicle) {
                        vehicle.startEngine();
                    }

                    break;
                }

                case 5: {

                    if (listVehicle.isEmpty()) {
                        System.out.println("Vui lòng tạo phương tiện trước!");
                        break;
                    }

                    System.out.println("\n--- HÀNH VI ĐẶC TRƯNG CỦA TỪNG LOẠI ---");

                    for (Vehicle vehicle : listVehicle) {

                        if (vehicle instanceof Car) {
                            ((Car) vehicle).openTrunk();
                        }

                        else if (vehicle instanceof Motorcycle) {
                            ((Motorcycle) vehicle).doWheelie();
                        }

                        else if (vehicle instanceof Truck) {
                            ((Truck) vehicle).loadCargo();
                        }
                    }

                    break;
                }

                case 6: {

                    scanner.nextLine();

                    System.out.println("\n--- THÊM PHƯƠNG TIỆN MỚI ---");

                    System.out.print("Loại (car/motorcycle/truck): ");
                    String type = scanner.nextLine();

                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Fuel Type: ");
                    String fuelType = scanner.nextLine();

                    switch (type.toLowerCase()) {

                        case "car":
                            listVehicle.add(new Car(brand, year, fuelType));
                            break;

                        case "motorcycle":
                            listVehicle.add(new Motorcycle(brand, year, fuelType));
                            break;

                        case "truck":
                            listVehicle.add(new Truck(brand, year, fuelType));
                            break;

                        default:
                            System.out.println("Loại phương tiện không hợp lệ!");
                    }

                    System.out.println("Thêm phương tiện thành công!");

                    break;
                }

                case 0: {

                    System.out.println("Thoát chương trình...");
                    running = false;
                    break;
                }

                default: {
                    System.out.println("Vui lòng chọn đúng chức năng!");
                }
            }
        }

        scanner.close();
    }

    public static void showMenu() {

        System.out.println("""
                
                ================ VEHICLE MANAGEMENT MENU =================
                
                1. Hiển thị thông tin tất cả phương tiện
                2. Kiểm tra Overriding: startEngine()
                3. Kiểm tra Overloading: move()
                4. Kiểm tra đa hình runtime (Vehicle array/list)
                5. Gọi hành vi đặc trưng của từng loại
                6. Thêm phương tiện mới
                0. Thoát
                
                ==========================================================
                """);
    }
}