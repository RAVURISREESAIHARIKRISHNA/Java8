package demo;

import java.io.File;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingText {
	public static void main(String[] args) throws IOException{
		File file = new File("G:\\MY MATERIALS\\kotlin-docs.pdf");
		
		PDDocument document = PDDocument.load(file);
		
		PDFTextStripper textStripper = new PDFTextStripper();
		
		String text = textStripper.getText(document);
		System.out.println(text);
		
		document.close();
	}
}
