package net.alphadev.usbstorage.scsi.answer;

import static net.alphadev.usbstorage.util.BitStitching.convertToInt;

/**
 * @author Jan Seeger <jan@alphadev.net>
 */
public class ReadCapacityResponse {
    public static final int LENGTH = 8;

    private int mBlockSize;
    private int mNumberOfBlocks;

    public ReadCapacityResponse(byte[] answer) {
        mNumberOfBlocks = convertToInt(answer, 0);
        mBlockSize = convertToInt(answer, 4);
    }

    public int getBlockSize() {
        return mBlockSize;
    }

    public int getNumberOfBlocks() {
        return mNumberOfBlocks;
    }
}
