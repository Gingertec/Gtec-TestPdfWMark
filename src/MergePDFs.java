import java.io.IOException;

import org.apache.pdfbox.Overlay;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;


public class MergePDFs{
	

	public PDDocument loadWatermark() throws IOException{
	PDDocument watermarkDoc = PDDocument.load("letterhead.pdf");
	return watermarkDoc;
	
	}
	
	
	public PDDocument loadDocToBeWatermarked() throws IOException{
	PDDocument realDoc = PDDocument.load("letter.pdf");
	return realDoc;
	}
	
	public PDDocument overlayDocuments(PDDocument watermarkDoc,PDDocument realDoc) throws IOException, COSVisitorException{
	Overlay overlay = new Overlay();
	overlay.overlay(realDoc,watermarkDoc);
	watermarkDoc.save("newHeadedDocument.pdf");
	return watermarkDoc;
	}
}