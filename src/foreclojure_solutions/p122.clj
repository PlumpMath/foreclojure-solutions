(ns foreclojure-solutions.p122
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Read a binary number"
  0 => (__ "0")
  7 => (__ "111")
  8 => (__ "1000")
  9 => (__ "1001")
  255 => (__ "11111111")
  1365 => (__ "10101010101")
  65535 => (__ "1111111111111111"))
