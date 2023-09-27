package API6ZADACHAKA;


    import java.util.ArrayList;
import java.util.List;
public class NNNN {

        public static void main(String[] args) {
            List<DocumentPage> documentPages = new ArrayList<>();


            documentPages.add(new DocumentPage("Page 1"));
            documentPages.add(new DocumentPage("Page 2"));
            documentPages.add(new DocumentPage("Page 3"));
            documentPages.add(new DocumentPage("Page 4"));


            if (documentPages.size() >= 3) {
                DocumentPage secondPage = documentPages.get(1);
                DocumentPage thirdPage = documentPages.get(2);


                System.out.println("Вторая страница: " + secondPage.getContent());
                System.out.println("Третья страница: " + thirdPage.getContent());
            } else {
                System.out.println("Недостаточно страниц в документе.");
            }
        }
    }
