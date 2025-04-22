package model;
import java.util.*;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;

public class Produto {
    public String nomeProduto;
    public String descricaoProduto;
    public String precoProduto;
    ListMultimap<Integer, String> produtos = ArrayListMultimap.create();
       // List<String> produtos = new ArrayList<>(); //

   public void CadastrarProduto() {
       Scanner leia = new Scanner(System.in);
       int idProduto = 0; //variavel para incremento de id para metodo get da lista produtos
        boolean loop = true;
       do {
           System.out.println("Informe o nome do produto: ");
           nomeProduto = leia.next();
           produtos.put(idProduto, nomeProduto);

           System.out.println("Insira a descrição do produto: ");
           descricaoProduto = leia.next();
           produtos.put(idProduto, descricaoProduto);

           System.out.println("Informe o valor do produto: ");
           precoProduto = leia.next();
           produtos.put(idProduto, precoProduto);

           System.out.println("Deseja cadastrar mais um produto?\n 1 - SIM \n 2- NAO ");
           int resposta = leia.nextInt();
           if( resposta == 2){
                loop = false;
           }
           idProduto++;
       } while(loop);
      // String precoProdutoString = String.valueOf(precoProduto);//


       System.out.println ("Produtos = ");
       int a = 0;
       while(a <= idProduto) { //loop imprimir lista
           System.out.println(produtos.get(a));
           a++;
       }
        }
    }


