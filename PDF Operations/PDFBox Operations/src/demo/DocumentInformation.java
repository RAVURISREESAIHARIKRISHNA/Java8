package demo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

public class DocumentInformation {
	public static void main(String[] args) throws IOException{
		File myFile = new File("G:\\Java Created\\myPdf_1.pdf");
		PDDocument document = PDDocument.load(myFile);
		
		PDDocumentInformation documentInformation = document.getDocumentInformation();
		
		documentInformation.setAuthor("R.S.S. Hari Krishna");
		documentInformation.setTitle("My Title");
		documentInformation.setCreator("Hari Krishna Publications");
		documentInformation.setSubject("My Subject");
		
		Calendar date = new GregorianCalendar();
		date.set(2015, 12, 20); //YYYY,MM,DD
		
		documentInformation.setCreationDate(date);
		date.set(2017, 12,21);
		documentInformation.setModificationDate(date);
		
		documentInformation.setKeywords("Hi,Hello,Important");
		
		document.save(myFile);
		System.out.println("Dcument Saved....");
		
	}
}
