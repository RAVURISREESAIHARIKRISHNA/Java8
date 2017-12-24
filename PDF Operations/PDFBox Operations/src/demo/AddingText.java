package demo;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class AddingText {
	public static void main(String[] args) throws IOException{
		File file = new File("G:\\\\Java Created\\\\myPdf_1.pdf");
		PDDocument document = PDDocument.load(file);
		PDPage my_page = document.getPage(0);
		
		PDPageContentStream contentStream = new PDPageContentStream(document ,my_page);
		
//		Begining PDPageContentStream....
		contentStream.beginText();
		
//		Setting Font and FontSize
		contentStream.setFont(PDType1Font.TIMES_BOLD_ITALIC,15);
		
//		Setting Position
		contentStream.newLineAtOffset(25,700);
		
//		Setting String to be displayed
		contentStream.showText("Hello World");
		
//		Ending PDPageContentStream
		contentStream.endText();
		
		System.out.println("Content Entered...");
		
		contentStream.close();
		
		document.save("G:\\\\Java Created\\\\myPdf_1.pdf");
		document.close();
		
	}
}
