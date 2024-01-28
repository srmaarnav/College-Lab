import cv2
import numpy as np

image = cv2.imread("./lab 2/img1.jpg")

cv2.imshow('Input Image', image)

c = (255/np.log(1 + np.max(image)))

log_trx_img = c * (np.log(1 + image))

log_trx_img = np.array(log_trx_img, dtype=np.uint8)

cv2.imshow('Output Image', log_trx_img)
cv2.waitKey(0)