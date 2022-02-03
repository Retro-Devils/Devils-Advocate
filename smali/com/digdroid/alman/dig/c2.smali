.class Lcom/digdroid/alman/dig/c2;
.super Lcom/digdroid/alman/dig/p;
.source ""


# instance fields
.field e:Landroid/database/sqlite/SQLiteDatabase;

.field f:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/c2;->e:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p2, p0, Lcom/digdroid/alman/dig/c2;->f:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method


# virtual methods
.method c(ILjava/lang/String;JJLjava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
