package dip;

public class DipExample {
    class EducationalEarningsCalculator implements IEarningsCalculator {

        @Override
        public double calculateEarnings(Video video) {
            return 1 + 1;
        }
    }

    class GamingEarningsCalculator implements IEarningsCalculator {

        @Override
        public double calculateEarnings(Video video) {
            return 2 + 2;
        }
    }

    class EntertainmentEarningsCalculator implements IEarningsCalculator {

        @Override
        public double calculateEarnings(Video video) {
            return 3 + 3;
        }
    }

    interface IEarningsCalculator {
        double calculateEarnings(Video video);
    }

    class Video {}
}
