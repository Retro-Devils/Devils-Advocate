.class public Lcom/android/billingclient/api/h$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/h$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/h;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/h;

    invoke-direct {v0}, Lcom/android/billingclient/api/h;-><init>()V

    iget v1, p0, Lcom/android/billingclient/api/h$b;->a:I

    invoke-static {v0, v1}, Lcom/android/billingclient/api/h;->a(Lcom/android/billingclient/api/h;I)I

    iget-object v1, p0, Lcom/android/billingclient/api/h$b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/h;->b(Lcom/android/billingclient/api/h;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/h$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(I)Lcom/android/billingclient/api/h$b;
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/h$b;->a:I

    return-object p0
.end method
