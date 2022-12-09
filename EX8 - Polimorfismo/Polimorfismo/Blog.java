package Polimorfismo;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        for (Post post : posts) {
            if(post.getTitle().equals(p.getTitle())) {
                throw new RuntimeException("Titulo já cadastrado");
            }
        }
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
            try {
                System.out.println("1 - Novo post de noticia");
                System.out.println("2 - Nova resenha de produto");
                System.out.println("3 - Novo post de outros assuntos");
                System.out.println("4 - Listar todas as postagens");
                System.out.println("5 - Curtir uma postagem");
                System.out.println("6 - Não curtir uma postagem");
                System.out.println("10 - Sair");
                System.out.println("Escolha uma opção: ");
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
                        if (productReview.getStars() >= 1 && productReview.getStars() <= 10) {
                            blog.posts.add(postProductReview);
                        }
                        break;
                    case 3:
                        Post generalPost = new Post();
                        blog.readData(generalPost, sc);
                        blog.posts.add(generalPost);
                        break;
                    case 4:
                        System.out.println();
                        blog.showAll();
                        if (blog.posts.size() == 0) {
                            System.out.println("Nenhuma postagem cadastrada");
                            System.out.println();
                        }
                        break;
                    case 5:
                        try {
                            if(!blog.posts.isEmpty()) {
                                System.out.print("Digite o indice da postagem: ");
                                int index = sc.nextInt();
                                sc.nextLine();
                                blog.posts.get(index).like();
                                System.out.println();
                                System.out.println("Postagem curtida!");
                                System.out.println();
                            } else {
                                System.out.println();
                                System.out.println("Nenhuma postagem cadastrada");
                                System.out.println();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println();
                            System.out.println("Entrada invalida! Utilize apenas numeros inteiros");
                            System.out.println();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println();
                            System.out.println("Codigo invalido, postagem inexistente");
                            System.out.println();
                        } 
                        break;
                    case 6:
                        try {
                            if(!blog.posts.isEmpty()) {
                                System.out.print("Digite o indice da postagem: ");
                                int index = sc.nextInt();
                                sc.nextLine();
                                blog.posts.get(index).dislike();
                                System.out.println();
                                System.out.println("Postagem não curtida!");
                                System.out.println();
                            } else {
                                System.out.println();
                                System.out.println("Nenhuma postagem cadastrada");
                                System.out.println();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println();
                            System.out.println("Entrada invalida! Utilize apenas numeros inteiros");
                            System.out.println();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println();
                            System.out.println("Codigo invalido, postagem inexistente");
                            System.out.println();
                        } 
                        break;
                    case 10:
                        System.out.println();
                        System.out.println("Fim do programa");
                        System.out.println();
                        break;
                    default:
                        System.out.println();
                        System.out.println("Opção inválida");
                        System.out.println();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Entrada invalida! Utilize apenas numeros inteiros");
                System.out.println();
                sc.nextLine();
            }
        } while (option != 10);        
        sc.close();
    }
}