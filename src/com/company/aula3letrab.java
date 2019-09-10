package com.company;

import java.util.Scanner;

public class aula3letrab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasProduzidas, pecasDefeituosas;
        System.out.println("INFORME A QUANTIDADE DE PEÇAS PRODUZIDAS: ");
        pecasProduzidas = sc.nextInt();
        System.out.println("INFORME A QUANTIDADE DE PEÇAS DEFEITUOSAS: ");
        pecasDefeituosas = sc.nextInt();
        if(pecasDefeituosas >= (pecasProduzidas * 0.1)) {
            System.out.println("MAQUINA PRECISA DE MANUTENÇÃO ");
        }else{
                System.out.println("MAQUINA NÃO PRECISA DE MANUTENÇÃO ");
            }
        }
    }

