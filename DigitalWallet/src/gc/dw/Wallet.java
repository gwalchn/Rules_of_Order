package gc.dw;

public interface Wallet {
	
	public Asset getAsset(int id);
	public void putIn(Asset asset);
	public boolean takingOut(Asset asset);
}
