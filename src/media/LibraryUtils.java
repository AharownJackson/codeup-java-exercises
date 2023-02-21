package media;

import java.util.Date;

public interface LibraryUtils {

    // METHODS //
   String identify();

   void setLastScan(Date date);

   Date getLastScan();


}
