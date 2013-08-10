(ns foreclojure-solutions.p104
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Write Roman Numerals"
  "I" => (__ 1)
  "XXX" => (__ 30)
  "IV" => (__ 4)
  "CXL" => (__ 140)
  "DCCCXXVII" => (__ 827)
  "MMMCMXCIX" => (__ 3999)
  "XLVIII" => (__ 48))
