package Ex8;
import java.util.ArrayList;
import java.util.Scanner;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<Post>();

    public void showAll() {
        for (Post post : posts) {
            post.show();
            System.out.println();
        }
    }

    public void readData(Post p, Scanner sc) {
        System.out.print("Informe o título do post: ");
        p.setTitle(sc.nextLine());
        System.out.print("Informe o conteúdo do post: ");
        p.setContent(sc.nextLine());
        p.setDate();

        if (p instanceof News) {
            System.out.print("Informe a fonte da notícia: ");
            ((News) p).setSource(sc.nextLine());
        }
        else if (p instanceof ProductReview) {
            System.out.print("Informe a marca do produto: ");
            ((ProductReview) p).setBrand(sc.nextLine());
            System.out.print("Avalie o produto entre 1 a 10 estrelas: ");
            ((ProductReview) p).evaluate(Integer.parseInt(sc.nextLine()));
        }

        System.out.println();
    }
    
    public static void main(String[] args) {
        Blog blog = new Blog();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1 - Novo post de noticia");
            System.out.println("2 - Nova resenha de produto");
            System.out.println("3 - Novo post de outros assuntos");
            System.out.println("4 - Listar todas as postagens");
            System.out.println("5 - Curtir uma postagem");
            System.out.println("6 - Não curtir uma postagem");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    News news = new News();
                    Post postNews = news;
                    blog.readData(postNews, sc);
                    blog.posts.add(postNews);
                    break;
                case 2:
                    ProductReview productReview = new ProductReview();
                    Post postProductReview = productReview;
                    blog.readData(postProductReview, sc);
                    if (productReview.getStars() > 0 || productReview.getStars() < 10) {
                        blog.posts.add(postProductReview);
                    }
                    break;
                case 3:
                    Post generalPost = new Post();
                    blog.readData(generalPost, sc);
                    blog.posts.add(generalPost);
                    break;
                case 4:
                    blog.showAll();
                    break;
                case 5:
                    System.out.print("Digite o indice da postagem: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if(index < 0 || index >= blog.posts.size()) {
                        System.out.println("Codigo invalido, postagem inexistente");
                    } else {
                        blog.posts.get(index).like();
                        System.out.println("Postagem curtida!");
                    }
                    break;
                case 6:
                    System.out.print("Digite o indice da postagem: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    if(index < 0 || index >= blog.posts.size()) {
                        System.out.println("Codigo invalido, postagem inexistente");
                    } else {
                        blog.posts.get(index).dislike();
                        System.out.println("Postagem não curtida!");
                    }
                    break;
                case 10:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (option != 10);
        
        sc.close();
    }
}