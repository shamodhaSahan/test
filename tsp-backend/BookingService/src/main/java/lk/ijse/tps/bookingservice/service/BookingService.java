package lk.ijse.tps.bookingservice.service;


import lk.ijse.tps.bookingservice.dto.BookingDTO;

import java.time.LocalDate;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 10/12/2023
 * Time : 1:28 AM
 */

public interface BookingService {
    BookingDTO addBooking(BookingDTO bookingDTO);
    BookingDTO getSelectedBooking(String bookingId);
    void updateBooking(BookingDTO bookingDTO);
    void deleteBooking(String bookingId);
    List<BookingDTO> getAllBooking();
    List<BookingDTO> getAllBookingByCustomerId(String customerId);
    List<BookingDTO> getAllBookingByPackageId(String packageId);
    List<BookingDTO> getAllBookingByGuideId(String guideId);
    List<BookingDTO> getAllBookingByHotelOptionId(String hotelOptionId);
    List<BookingDTO> getAllBookingByVehicleId(String vehicleId);
    List<BookingDTO> getAllBookingByDate(LocalDate date);
    List<BookingDTO> getAllBookingByStartDate(LocalDate startDate);
}
