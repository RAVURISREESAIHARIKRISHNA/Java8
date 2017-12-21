package demo;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

public class ShowDocumentInformation {
	public static void main(String[] args) throws IOException {
		File myFile = new File("G:\\Java Created\\myPdf_1.pdf");
		PDDocument document = PDDocument.load(myFile);
		PDDocumentInformation docInfo = document.getDocumentInformation();
		System.out.println(docInfo.getAuthor());
		System.out.println(docInfo.getCreator());
		System.out.println(docInfo.getKeywords());
		System.out.println(docInfo.getSubject());
		System.out.println(docInfo.getCreationDate());
		System.out.println(docInfo.getModificationDate());
		System.out.println(docInfo.getTitle());
		document.close();
	}
}
