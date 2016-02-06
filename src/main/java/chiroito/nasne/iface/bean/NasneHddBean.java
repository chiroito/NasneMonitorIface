package chiroito.nasne.iface.bean;

public class NasneHddBean {

    private int id;
    private boolean internalFlag;
    private boolean mountStatus;
    private boolean registerFlag;
    private String format;
    private String name;
    private String vendorID;
    private String productID;
    private String serialNumber;
    private long usedVolumeSize;
    private long freeVolumeSize;
    private long totalVolumeSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getInternalFlag() {
        return internalFlag;
    }

    public void setInternalFlag(boolean internalFlag) {
        this.internalFlag = internalFlag;
    }

    public boolean getMountStatus() {
        return mountStatus;
    }

    public void setMountStatus(boolean mountStatus) {
        this.mountStatus = mountStatus;
    }

    public boolean getRegisterFlag() {
        return registerFlag;
    }

    public void setRegisterFlag(boolean registerFlag) {
        this.registerFlag = registerFlag;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getUsedVolumeSize() {
        return usedVolumeSize;
    }

    public void setUsedVolumeSize(long usedVolumeSize) {
        this.usedVolumeSize = usedVolumeSize;
    }

    public long getFreeVolumeSize() {
        return freeVolumeSize;
    }

    public void setFreeVolumeSize(long freeVolumeSize) {
        this.freeVolumeSize = freeVolumeSize;
    }

    public long getTotalVolumeSize() {
        return totalVolumeSize;
    }

    public void setTotalVolumeSize(long totalVolumeSize) {
        this.totalVolumeSize = totalVolumeSize;
    }

    @Override
    public String toString() {
        return "NasneHddBean [id=" + id + ", internalFlag=" + internalFlag + ", mountStatus=" + mountStatus +
               ", registerFlag=" + registerFlag + ", format=" + format + ", name=" + name + ", vendorID=" + vendorID +
               ", productID=" + productID + ", serialNumber=" + serialNumber + ", usedVolumeSize=" + usedVolumeSize +
               ", freeVolumeSize=" + freeVolumeSize + ", totalVolumeSize=" + totalVolumeSize + "]";
    }
}