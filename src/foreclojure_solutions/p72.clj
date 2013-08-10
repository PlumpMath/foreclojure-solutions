(ns foreclojure-solutions.p72
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Rearranging Code: ->>"
  (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
   (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
   11) => true)
