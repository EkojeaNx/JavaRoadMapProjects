# Access Modifiers

Java'da bir sınıfa ait nitelik ve davranışlara ulaşabilmek için Erişim Belirleyiciler (Access Modifiers) kullanılır. Erişim belirleyiciler, değişken ,metot ve sınıfların önüne yazılır ve yazıldıkları konuların erişilebilecekleri alanları belirlerler. Java'da 3 adet Erişim Belirleyiciler vardır bunlar ; public , private ve protected.

# 1. Private Erişim Belirleyici

Java'da private deyimi yazıldığı öğenin sadece ait olduğu sınıftan doğrudan erişilebilir olduğunu ve o sınıfın dışındaki kod parçacıklarından doğrudan erişilemeyeceğini tanımlar. Nesne Yönelimli Programlama'nın temel ilkelerinden olan Sarmalama ilkesi gereği, sınıf içindeki değişkenler sadece sınıf içinde doğrudan erişebilir olması gerekir. Bundan dolayı, genellikle değişkenler "private" olarak tanımlanır. Bazı zamanlarda ise sadece o sınıfta çağrılmasını istediğimiz değişkenler veya metotları da private olarak tanımlarız.

# 2. Public Erişim Belirleyici

Java'da "public" deyimi , yazıldığı öğenin sadece olduğu sınıf için değil, diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar. Sınıflara ait nesnelerin ve diğer nesneler tarafından kullanılması istenilen metotlar için "Public Erişim Düzenleyicisi" kullanılır.

# 3. Protected Erişim Belirleyici

Java'da "protected" deyimi , public ve private arasında kalan bir erişim düzenleyicidir. Protected ile tanımlanan öğeler, kendisi ile aynı package (paket) bulunan sınıflar tarafından doğrudan erişilir.

# Varsayılan

Eğer yazdığımız kodlarda herhangi bir öğenin önüne erişim düzenleyici yazmazsak, o öğenin erişimi ait olduğu paket ile sınırlandırılır. Aynı pakette bulunan başka bir sınıf içinden o öğeye erişilir.

# Tüm kullanım şekilleri

| Erişim Belirleyici   |      Sınıf İçi Erişim      |  Paket İçi Erişim |      Paket Dışından Kalıtımla Erişim      |  Paket Dışından Erişim |
|----------|:-------------:|------:|:-------------:|------:|
| Private |  EVET | HAYIR |  HAYIR | HAYIR |
| Default |    EVET   |   EVET |  HAYIR | HAYIR |
| Protected | EVET |    EVET |  EVET | HAYIR |
| Public | EVET |    EVET |  EVET | EVET |