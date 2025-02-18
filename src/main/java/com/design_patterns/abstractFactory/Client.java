package com.design_patterns.abstractFactory;

import com.design_patterns.abstractFactory.infra.AbstractSegment;
import com.design_patterns.abstractFactory.infra.ClassicSegment;
import com.design_patterns.abstractFactory.infra.ModernSegment;
import com.design_patterns.abstractFactory.model.Chair;
import com.design_patterns.abstractFactory.model.Table;

import java.util.Scanner;

public class Client {

    private Chair chair;
    private Table table;

    public Client(AbstractSegment segment) {
        this.chair = segment.craftChair();
        this.table = segment.craftTable();
    }

    public void craft() {
        this.chair.craft();
        this.table.craft();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbstractSegment segment;
        while (true) {
            System.out.println("Qual tipo de segmento quer criar? M=Moderno, C=Clássico");
            String type = sc.nextLine().toUpperCase();
            segment = switch (type) {
                case "M" -> new ModernSegment();
                case "C" -> new ClassicSegment();
                default -> {
                    System.out.println("Tipo invalido");
                    yield null;
                }
            };
            if (segment == null) continue;
            break;

        }
        sc.close();
        Client client = new Client(segment);
        client.craft();

    }
}
