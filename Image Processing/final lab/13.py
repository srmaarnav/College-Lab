import cv2
import numpy as np

def min_filter(image, kernel_size=3):
    # Ensure the kernel size is odd
    if kernel_size % 2 == 0:
        raise ValueError("Kernel size must be an odd number")
    
    # Pad the image to handle border pixels
    pad_size = kernel_size // 2
    padded_image = cv2.copyMakeBorder(image, pad_size, pad_size, pad_size, pad_size, cv2.BORDER_REFLECT)
    
    # Apply minimum filtering
    result = np.zeros_like(image)
    for i in range(pad_size, padded_image.shape[0] - pad_size):
        for j in range(pad_size, padded_image.shape[1] - pad_size):
            neighborhood = padded_image[i-pad_size:i+pad_size+1, j-pad_size:j+pad_size+1]
            result[i-pad_size, j-pad_size] = np.min(neighborhood)
    
    return result.astype(np.uint8)

input_image = cv2.imread("./final lab/3.jpg", cv2.IMREAD_GRAYSCALE)
# Apply minimum filtering with a 3x3 kernel
output_image = min_filter(input_image, kernel_size=3)

# Display the results
cv2.imshow("Original Image", input_image)
cv2.imshow("Minimum Filtered Image", output_image)
cv2.waitKey(0)
cv2.destroyAllWindows()
