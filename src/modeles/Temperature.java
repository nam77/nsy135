 package modeles;

      /**
      * Une classe permettant d'obtenir une température en Celsius ou Fahrenheit.
      *
      */
      public class Temperature {

        /**
         * La valeur, exprimée en degrés Celsius
         */
        private double celsius;

        /**
         * Le constructeur, prend des Celsius en paramètres
        */
        public Temperature(double valeurCelsius)
        {
              celsius = valeurCelsius;
        }

        /**
         * Pour obtenir la valeur en Celsius
         *
         * @return Valeur de la température en Celsius
       */
        public double getCelsius() {
              return celsius;
        }

        /**
         * Pour obtenir la valeur en Fahrenheit
         *
         * @return Valeur de la température en Fahrenheit
        */
        public double getFahrenheit() {
              return (celsius * 9/5) + 32;
      }
}