---
description: >-
  Returns an array of vehicles depending on your current location (latitude,
  longitude).
cover: >-
  https://file.mk.co.kr/meet/neds/2023/04/image_readtop_2023_290493_16814543415430832.jpg
coverY: 0
---

# \[API-PM-01] Search Nearby Vehicles

API Code: API-PM-01\
API Name: Search Nearby Vehicles

## API Description

<mark style="color:green;">`POST`</mark> `/api/pm`

You can search for nearby vehicles based on your current location (latitude, longitude). If you prefer vehicles from a specific PM operator, you can specify the operator, or leave "operatorIds" as null to retrieve vehicles from all operators. Note that this API necessitates your location coordinates (latitude, longitude), which cannot be null.

**Headers**

| Name          | Value                 |
| ------------- | --------------------- |
| Content-Type  | `application/json`    |
| REQUESTER\_ID | `{your-requester-id}` |

**Body**

| Name        | Type      | Description                                                       |
| ----------- | --------- | ----------------------------------------------------------------- |
| operatorIds | string\[] | <p>Array of operator IDs <br>(null if you want all operators)</p> |
| `age`       | number    | Age of the user                                                   |

**Response**

{% tabs %}
{% tab title="200" %}
```json
{
  "id": 1,
  "name": "John",
  "age": 30
}
```
{% endtab %}

{% tab title="400" %}
```json
{
  "error": "Invalid request"
}
```
{% endtab %}
{% endtabs %}
