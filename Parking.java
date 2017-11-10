class Parking
{
	int numCarSlots;
	int numBikeSlots;
	int numTruckSlots;

	Car carSlots[];
	Bike bikeSlots[];
	Truck truckSlots[];

	Parking(int numCarSlots, int numBikeSlots, int numTruckSlots)
	{
		this.numCarSlots = numCarSlots;
		this.numBikeSlots = numBikeSlots;
		this.numTruckSlots = numTruckSlots;
		this.carSlots  = new Car[numCarSlots];
		this.bikeSlots = new Bike[numBikeSlots];
		this.truckSlots = new Truck[numTruckSlots];
	}



}