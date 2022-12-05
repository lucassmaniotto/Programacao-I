package Interface;
public class Teste {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto(2, 5);
        Conjunto c2 = new Conjunto(17, 18);
        Conjunto c3 = new Conjunto(10, -3);

        Data d1 = new Data(14, 10, 2000);
        Data d2 = new Data(15, 10, 2000);
        Data d3 = new Data(14, 11, 2000);
        Data d4 = new Data(14, 10, 2001);
        Data d5 = new Data(14, 10, 2000);

        //Teste de Conjuntos
        System.out.println("Teste de Conjuntos");
        System.out.println("Conjunto 1: " + c1.getElementos() + "   | Soma: " + c1.soma());
        System.out.println("Conjunto 2: " + c2.getElementos() + " | Soma: " + c2.soma());
        System.out.println("Conjunto 3: " + c3.getElementos() + "   | Soma: " + c3.soma());

        System.out.println();

        //Teste de maior
        System.out.println("Teste de maior");
        if(c1.maior(c2)) {
            System.out.println("Conjunto 1 é maior que Conjunto 2");
        } else {
            System.out.println("Conjunto 1 não é maior que Conjunto 2");
        }

        if(c2.maior(c3)) {
            System.out.println("Conjunto 2 é maior que Conjunto 3");
        } else {
            System.out.println("Conjunto 2 não é maior que Conjunto 3");
        }

        System.out.println();

        //Teste de menor
        System.out.println("Teste de menor");
        if(c1.menor(c2)) {
            System.out.println("Conjunto 1 é menor que Conjunto 2");
        } else {
            System.out.println("Conjunto 1 não é menor que Conjunto 2");
        }

        if(c2.menor(c3)) {
            System.out.println("Conjunto 2 é menor que Conjunto 3");
        } else {
            System.out.println("Conjunto 2 não é menor que Conjunto 3");
        }

        System.out.println();

        //Teste de igual
        System.out.println("Teste de igual");
        if(c1.igual(c2)) {
            System.out.println("Conjunto 1 é igual a Conjunto 2");
        } else {
            System.out.println("Conjunto 1 não é igual a Conjunto 2");
        }

        if(c1.igual(c3)) {
            System.out.println("Conjunto 1 é igual a Conjunto 3");
        } else {
            System.out.println("Conjunto 1 não é igual a Conjunto 3");
        }

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();

        //Teste de Datas
        System.out.println("Teste de Datas");
        System.out.println("Data 1: " + d1.getDataFormatada());
        System.out.println("Data 2: " + d2.getDataFormatada());
        System.out.println("Data 3: " + d3.getDataFormatada());
        System.out.println("Data 4: " + d4.getDataFormatada());
        System.out.println("Data 5: " + d5.getDataFormatada());

        System.out.println();

        //Teste de maior
        System.out.println("Teste de maior");
        if(d1.maior(d2)) {
            System.out.println("Data 1 é maior que Data 2");
        } else {
            System.out.println("Data 1 não é maior que Data 2");
        }

        if(d1.maior(d3)) {
            System.out.println("Data 1 é maior que Data 3");
        } else {
            System.out.println("Data 1 não é maior que Data 3");
        }

        if(d1.maior(d4)) {
            System.out.println("Data 1 é maior que Data 4");
        } else {
            System.out.println("Data 1 não é maior que Data 4");
        }

        if(d2.maior(d1)) {
            System.out.println("Data 2 é maior que Data 1");
        } else {
            System.out.println("Data 2 não é maior que Data 1");
        }

        if(d2.maior(d3)) {
            System.out.println("Data 2 é maior que Data 3");
        } else {
            System.out.println("Data 2 não é maior que Data 3");
        }

        if(d2.maior(d4)) {
            System.out.println("Data 2 é maior que Data 4");
        } else {
            System.out.println("Data 2 não é maior que Data 4");
        }

        if(d3.maior(d1)) {
            System.out.println("Data 3 é maior que Data 1");
        } else {
            System.out.println("Data 3 não é maior que Data 1");
        }

        if(d3.maior(d2)) {
            System.out.println("Data 3 é maior que Data 2");
        } else {
            System.out.println("Data 3 não é maior que Data 2");
        }

        if(d3.maior(d4)) {
            System.out.println("Data 3 é maior que Data 4");
        } else {
            System.out.println("Data 3 não é maior que Data 4");
        }

        if(d4.maior(d1)) {
            System.out.println("Data 4 é maior que Data 1");
        } else {
            System.out.println("Data 4 não é maior que Data 1");
        }

        if(d4.maior(d2)) {
            System.out.println("Data 4 é maior que Data 2");
        } else {
            System.out.println("Data 4 não é maior que Data 2");
        }

        if(d4.maior(d3)) {
            System.out.println("Data 4 é maior que Data 3");
        } else {
            System.out.println("Data 4 não é maior que Data 3");
        }

        if(d5.maior(d2)) {
            System.out.println("Data 5 é maior que Data 2");
        } else {
            System.out.println("Data 5 não é maior que Data 2");
        }

        if(d5.maior(d3)) {
            System.out.println("Data 5 é maior que Data 3");
        } else {
            System.out.println("Data 5 não é maior que Data 3");
        }

        if(d5.maior(d4)) {
            System.out.println("Data 5 é maior que Data 4");
        } else {
            System.out.println("Data 5 não é maior que Data 4");
        }

        System.out.println();

        //Teste de menor
        System.out.println("Teste de menor");
        if(d1.menor(d2)) {
            System.out.println("Data 1 é menor que Data 2");
        } else {
            System.out.println("Data 1 não é menor que Data 2");
        }

        if(d1.menor(d3)) {
            System.out.println("Data 1 é menor que Data 3");
        } else {
            System.out.println("Data 1 não é menor que Data 3");
        }

        if(d1.menor(d4)) {
            System.out.println("Data 1 é menor que Data 4");
        } else {
            System.out.println("Data 1 não é menor que Data 4");
        }

        if(d2.menor(d1)) {
            System.out.println("Data 2 é menor que Data 1");
        } else {
            System.out.println("Data 2 não é menor que Data 1");
        }

        if(d2.menor(d3)) {
            System.out.println("Data 2 é menor que Data 3");
        } else {
            System.out.println("Data 2 não é menor que Data 3");
        }

        if(d2.menor(d4)) {
            System.out.println("Data 2 é menor que Data 4");
        } else {
            System.out.println("Data 2 não é menor que Data 4");
        }

        if(d3.menor(d1)) {
            System.out.println("Data 3 é menor que Data 1");
        } else {
            System.out.println("Data 3 não é menor que Data 1");
        }

        if(d3.menor(d2)) {
            System.out.println("Data 3 é menor que Data 2");
        } else {
            System.out.println("Data 3 não é menor que Data 2");
        }

        if(d3.menor(d4)) {
            System.out.println("Data 3 é menor que Data 4");
        } else {
            System.out.println("Data 3 não é menor que Data 4");
        }

        if(d4.menor(d1)) {
            System.out.println("Data 4 é menor que Data 1");
        } else {
            System.out.println("Data 4 não é menor que Data 1");
        }

        if(d4.menor(d2)) {
            System.out.println("Data 4 é menor que Data 2");
        } else {
            System.out.println("Data 4 não é menor que Data 2");
        }

        if(d4.menor(d3)) {
            System.out.println("Data 4 é menor que Data 3");
        } else {
            System.out.println("Data 4 não é menor que Data 3");
        }

        if(d5.menor(d2)) {
            System.out.println("Data 5 é menor que Data 2");
        } else {
            System.out.println("Data 5 não é menor que Data 2");
        }

        if(d5.menor(d3)) {
            System.out.println("Data 5 é menor que Data 3");
        } else {
            System.out.println("Data 5 não é menor que Data 3");
        }

        if(d5.menor(d4)) {
            System.out.println("Data 5 é menor que Data 4");
        } else {
            System.out.println("Data 5 não é menor que Data 4");
        }

        System.out.println();

        //Teste de igual
        System.out.println("Teste de igual");

        if(d1.igual(d2)) {
            System.out.println("Data 1 é igual a Data 2");
        } else {
            System.out.println("Data 1 não é igual a Data 2");
        }

        if(d1.igual(d3)) {
            System.out.println("Data 1 é igual a Data 3");
        } else {
            System.out.println("Data 1 não é igual a Data 3");
        }

        if(d1.igual(d4)) {
            System.out.println("Data 1 é igual a Data 4");
        } else {
            System.out.println("Data 1 não é igual a Data 4");
        }

        if(d1.igual(d5)) {
            System.out.println("Data 1 é igual a Data 5");
        } else {
            System.out.println("Data 1 não é igual a Data 5");
        }

        if(d2.igual(d1)) {
            System.out.println("Data 2 é igual a Data 1");
        } else {
            System.out.println("Data 2 não é igual a Data 1");
        }

        if(d2.igual(d3)) {
            System.out.println("Data 2 é igual a Data 3");
        } else {
            System.out.println("Data 2 não é igual a Data 3");
        }

        if(d2.igual(d4)) {
            System.out.println("Data 2 é igual a Data 4");
        } else {
            System.out.println("Data 2 não é igual a Data 4");
        }

        if(d2.igual(d5)) {
            System.out.println("Data 2 é igual a Data 5");
        } else {
            System.out.println("Data 2 não é igual a Data 5");
        }

        if(d3.igual(d1)) {
            System.out.println("Data 3 é igual a Data 1");
        } else {
            System.out.println("Data 3 não é igual a Data 1");
        }

        if(d3.igual(d2)) {
            System.out.println("Data 3 é igual a Data 2");
        } else {
            System.out.println("Data 3 não é igual a Data 2");
        }

        if(d3.igual(d4)) {
            System.out.println("Data 3 é igual a Data 4");
        } else {
            System.out.println("Data 3 não é igual a Data 4");
        }

        if(d3.igual(d5)) {
            System.out.println("Data 3 é igual a Data 5");
        } else {
            System.out.println("Data 3 não é igual a Data 5");
        }

        if(d4.igual(d1)) {
            System.out.println("Data 4 é igual a Data 1");
        } else {
            System.out.println("Data 4 não é igual a Data 1");
        }

        if(d4.igual(d2)) {
            System.out.println("Data 4 é igual a Data 2");
        } else {
            System.out.println("Data 4 não é igual a Data 2");
        }

        if(d4.igual(d3)) {
            System.out.println("Data 4 é igual a Data 3");
        } else {
            System.out.println("Data 4 não é igual a Data 3");
        }

        if(d4.igual(d5)) {
            System.out.println("Data 4 é igual a Data 5");
        } else {
            System.out.println("Data 4 não é igual a Data 5");
        }

        if(d5.igual(d1)) {
            System.out.println("Data 5 é igual a Data 1");
        } else {
            System.out.println("Data 5 não é igual a Data 1");
        }

        if(d5.igual(d2)) {
            System.out.println("Data 5 é igual a Data 2");
        } else {
            System.out.println("Data 5 não é igual a Data 2");
        }

        if(d5.igual(d3)) {
            System.out.println("Data 5 é igual a Data 3");
        } else {
            System.out.println("Data 5 não é igual a Data 3");
        }

        if(d5.igual(d4)) {
            System.out.println("Data 5 é igual a Data 4");
        } else {
            System.out.println("Data 5 não é igual a Data 4");
        }
    }
}