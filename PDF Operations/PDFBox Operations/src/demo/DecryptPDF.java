package demo;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class DecryptPDF {
	public static void main(String[] args) throws IOException{
		File my_file = new File("G:\\\\Java Created\\\\myPdf_1_encrypted.pdf");
		PDDocument document = PDDocument.load(my_file,"password");
		AccessPermission permission = new AccessPermission();
		permission.setCanPrint(false);
		
		StandardProtectionPolicy spp = new StandardProtectionPolicy("","",permission);
		spp.setEncryptionKeyLength(256);
		spp.setPermissions(permission);
		document.protect(spp);
		document.save("G:\\\\Java Created\\\\myPdf_1_dencrypt.pdf");
		document.close();
		System.out.println("Decrypted....");
	}
}
