// In MaterialDetailActivity.java
Intent shareIntent = new Intent(Intent.ACTION_SEND);
shareIntent.setType("text/plain");
shareIntent.putExtra(Intent.EXTRA_SUBJECT, "تحميل الملزمة");
shareIntent.putExtra(Intent.EXTRA_TEXT, "رابط تحميل: " + downloadUrl);
startActivity(Intent.createChooser(shareIntent, "مشاركة عبر"));
