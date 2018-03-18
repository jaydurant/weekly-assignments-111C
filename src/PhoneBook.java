
public class PhoneBook {
	private ListingPerson[] listings;
	
	public void setListings(ListingPerson[] listings) {
		this.listings = listings;
	}
	
	public void findListing(String name) {
		int mid = 0;
		int start = 0;
		int end  = listings.length - 1;
		boolean found = false;
		
		while(start <= end && !found) {
			
			mid = (start + end) / 2;
		
			if(name.compareTo(listings[mid].getName()) > 0 ) {
				start = ++mid;
			}
			else if(name.compareTo(listings[mid].getName()) < 0) {
				end = --mid;
			}else {
				found = true;
			}
		}
		
		if(found) {
			ListingPerson person = listings[mid];
			System.out.println("Found Listing: @Index " + mid + " " + person.getName() + " " + person.getPhoneNumber());
		}else {
			System.out.println(name + " not found");
		}
		
	}

}
