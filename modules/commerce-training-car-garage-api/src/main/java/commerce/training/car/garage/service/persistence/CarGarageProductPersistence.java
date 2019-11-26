/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package commerce.training.car.garage.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import commerce.training.car.garage.exception.NoSuchCarGarageProductException;
import commerce.training.car.garage.model.CarGarageProduct;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the car garage product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Gavin Hinfey
 * @see CarGarageProductUtil
 * @generated
 */
@ProviderType
public interface CarGarageProductPersistence
	extends BasePersistence<CarGarageProduct> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CarGarageProductUtil} to access the car garage product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, CarGarageProduct> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the car garage products where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid(String uuid);

	/**
	 * Returns a range of all the car garage products where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @return the range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the car garage products where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns an ordered range of all the car garage products where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first car garage product in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the first car garage product in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns the last car garage product in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the last car garage product in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns the car garage products before and after the current car garage product in the ordered set where uuid = &#63;.
	 *
	 * @param carGarageProductId the primary key of the current car garage product
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car garage product
	 * @throws NoSuchCarGarageProductException if a car garage product with the primary key could not be found
	 */
	public CarGarageProduct[] findByUuid_PrevAndNext(
			long carGarageProductId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Removes all the car garage products where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of car garage products where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching car garage products
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the car garage product where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCarGarageProductException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByUUID_G(String uuid, long groupId)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the car garage product where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the car garage product where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the car garage product where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the car garage product that was removed
	 */
	public CarGarageProduct removeByUUID_G(String uuid, long groupId)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the number of car garage products where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching car garage products
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the car garage products where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the car garage products where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @return the range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the car garage products where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns an ordered range of all the car garage products where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first car garage product in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the first car garage product in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns the last car garage product in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the last car garage product in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns the car garage products before and after the current car garage product in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param carGarageProductId the primary key of the current car garage product
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car garage product
	 * @throws NoSuchCarGarageProductException if a car garage product with the primary key could not be found
	 */
	public CarGarageProduct[] findByUuid_C_PrevAndNext(
			long carGarageProductId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Removes all the car garage products where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of car garage products where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching car garage products
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the car garage products where carGarageId = &#63;.
	 *
	 * @param carGarageId the car garage ID
	 * @return the matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByCarGarageId(long carGarageId);

	/**
	 * Returns a range of all the car garage products where carGarageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param carGarageId the car garage ID
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @return the range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByCarGarageId(
		long carGarageId, int start, int end);

	/**
	 * Returns an ordered range of all the car garage products where carGarageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param carGarageId the car garage ID
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByCarGarageId(
		long carGarageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns an ordered range of all the car garage products where carGarageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param carGarageId the car garage ID
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching car garage products
	 */
	public java.util.List<CarGarageProduct> findByCarGarageId(
		long carGarageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first car garage product in the ordered set where carGarageId = &#63;.
	 *
	 * @param carGarageId the car garage ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByCarGarageId_First(
			long carGarageId,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the first car garage product in the ordered set where carGarageId = &#63;.
	 *
	 * @param carGarageId the car garage ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByCarGarageId_First(
		long carGarageId,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns the last car garage product in the ordered set where carGarageId = &#63;.
	 *
	 * @param carGarageId the car garage ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car garage product
	 * @throws NoSuchCarGarageProductException if a matching car garage product could not be found
	 */
	public CarGarageProduct findByCarGarageId_Last(
			long carGarageId,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the last car garage product in the ordered set where carGarageId = &#63;.
	 *
	 * @param carGarageId the car garage ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car garage product, or <code>null</code> if a matching car garage product could not be found
	 */
	public CarGarageProduct fetchByCarGarageId_Last(
		long carGarageId,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns the car garage products before and after the current car garage product in the ordered set where carGarageId = &#63;.
	 *
	 * @param carGarageProductId the primary key of the current car garage product
	 * @param carGarageId the car garage ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car garage product
	 * @throws NoSuchCarGarageProductException if a car garage product with the primary key could not be found
	 */
	public CarGarageProduct[] findByCarGarageId_PrevAndNext(
			long carGarageProductId, long carGarageId,
			com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
				orderByComparator)
		throws NoSuchCarGarageProductException;

	/**
	 * Removes all the car garage products where carGarageId = &#63; from the database.
	 *
	 * @param carGarageId the car garage ID
	 */
	public void removeByCarGarageId(long carGarageId);

	/**
	 * Returns the number of car garage products where carGarageId = &#63;.
	 *
	 * @param carGarageId the car garage ID
	 * @return the number of matching car garage products
	 */
	public int countByCarGarageId(long carGarageId);

	/**
	 * Caches the car garage product in the entity cache if it is enabled.
	 *
	 * @param carGarageProduct the car garage product
	 */
	public void cacheResult(CarGarageProduct carGarageProduct);

	/**
	 * Caches the car garage products in the entity cache if it is enabled.
	 *
	 * @param carGarageProducts the car garage products
	 */
	public void cacheResult(java.util.List<CarGarageProduct> carGarageProducts);

	/**
	 * Creates a new car garage product with the primary key. Does not add the car garage product to the database.
	 *
	 * @param carGarageProductId the primary key for the new car garage product
	 * @return the new car garage product
	 */
	public CarGarageProduct create(long carGarageProductId);

	/**
	 * Removes the car garage product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carGarageProductId the primary key of the car garage product
	 * @return the car garage product that was removed
	 * @throws NoSuchCarGarageProductException if a car garage product with the primary key could not be found
	 */
	public CarGarageProduct remove(long carGarageProductId)
		throws NoSuchCarGarageProductException;

	public CarGarageProduct updateImpl(CarGarageProduct carGarageProduct);

	/**
	 * Returns the car garage product with the primary key or throws a <code>NoSuchCarGarageProductException</code> if it could not be found.
	 *
	 * @param carGarageProductId the primary key of the car garage product
	 * @return the car garage product
	 * @throws NoSuchCarGarageProductException if a car garage product with the primary key could not be found
	 */
	public CarGarageProduct findByPrimaryKey(long carGarageProductId)
		throws NoSuchCarGarageProductException;

	/**
	 * Returns the car garage product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param carGarageProductId the primary key of the car garage product
	 * @return the car garage product, or <code>null</code> if a car garage product with the primary key could not be found
	 */
	public CarGarageProduct fetchByPrimaryKey(long carGarageProductId);

	/**
	 * Returns all the car garage products.
	 *
	 * @return the car garage products
	 */
	public java.util.List<CarGarageProduct> findAll();

	/**
	 * Returns a range of all the car garage products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @return the range of car garage products
	 */
	public java.util.List<CarGarageProduct> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the car garage products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of car garage products
	 */
	public java.util.List<CarGarageProduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator);

	/**
	 * Returns an ordered range of all the car garage products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CarGarageProductModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of car garage products
	 * @param end the upper bound of the range of car garage products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of car garage products
	 */
	public java.util.List<CarGarageProduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarGarageProduct>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the car garage products from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of car garage products.
	 *
	 * @return the number of car garage products
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}