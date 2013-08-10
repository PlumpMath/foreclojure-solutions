(ns foreclojure-solutions.p128
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Recognize Playing Cards"
  {:suit :diamond :rank 10} => (__ "DQ")
  {:suit :heart :rank 3} => (__ "H5")
  {:suit :club :rank 12} => (__ "CA")
  (range 13) => (map (comp :rank __ str)
                     '[S2 S3 S4 S5 S6 S7
                       S8 S9 ST SJ SQ SK SA]))
