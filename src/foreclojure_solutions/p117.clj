(ns foreclojure-solutions.p117
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "For Science!"
  true => (__ ["M   C"])
  false => (__ ["M # C"])
  true => (__ ["#######"
                "#     #"
                "#  #  #"
                "#M # C#"
                "#######"])
  false => (__ ["########"
                "#M  #  #"
                "#   #  #"
                "# # #  #"
                "#   #  #"
                "#  #   #"
                "#  # # #"
                "#  #   #"
                "#  #  C#"
                "########"])
  false => (__ ["M     "
                "      "
                "      "
                "      "
                "    ##"
                "    #C"])
  true => (__ ["C######"
                " #     "
                " #   # "
                " #   #M"
                "     # "])
  true => (__ ["C# # # #"
                "        "
                "# # # # "
                "        "
                " # # # #"
                "        "
                "# # # #M"]))
