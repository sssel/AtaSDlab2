package com.company;

import javax.crypto.spec.RC2ParameterSpec;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashTable hashTable = new HashTable(10);
        System.out.println("Создана хэш-таблица размером 10. Добавление прямоугольников: ");
        for (int i = 0; i < 6; i++) {
            Rectangle rct = new Rectangle();
            if (hashTable.insert(rct)){
                System.out.println("Успешно добавлен прямоугольник. Периметр: "+rct.getPerimeter());
            } else System.out.println("Коллизия. Периметр: "+rct.getPerimeter());
        }
    }
}
