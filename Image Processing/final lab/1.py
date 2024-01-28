## write a program to read, display and save an image.

import cv2

# Read an image from file
image = cv2.imread('./final lab/img1.jpg')

# Check if the image was successfully loaded
if image is not None:
    # Display the image in a window
    cv2.imshow('Image', image)
    
    # Wait for a key press and close the window
    cv2.waitKey(0)
    cv2.destroyAllWindows()

    # Save the image to a new file
    cv2.imwrite('./final lab/processed_image.jpg', image)
else:
    print('Image not found or could not be loaded.')
