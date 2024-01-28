## bgr to greyscale conversion

import cv2 
image = cv2.imread("./final lab/img1.jpg")
cv2.imshow("real image", image)
gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
cv2.imshow("processed image", gray_image)
cv2.waitKey(0)
cv2.destroyAllWindows()