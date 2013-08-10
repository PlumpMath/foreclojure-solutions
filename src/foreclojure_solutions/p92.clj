(ns foreclojure-solutions.p92
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Read Roman numerals"
  14 => (__ "XIV")
  827 => (__ "DCCCXXVII")
  3999 => (__ "MMMCMXCIX")
  (= 48 (__ "XLVIII"))
   => true)
