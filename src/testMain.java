import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;


public class testMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		MergePDFs merge = new MergePDFs();
		PDDocument watermarkDoc = merge.loadWatermark();
		PDDocument realDoc = merge.loadDocToBeWatermarked();
		try {
			merge.overlayDocuments(watermarkDoc, realDoc);
		} catch (COSVisitorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
