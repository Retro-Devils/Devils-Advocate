.class public final Lcom/android/billingclient/api/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/a$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/a;-><init>(Lcom/android/billingclient/api/a$a;)V

    iget-object v1, p0, Lcom/android/billingclient/api/a$b;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/a;->a(Lcom/android/billingclient/api/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/android/billingclient/api/a$b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/a;->b(Lcom/android/billingclient/api/a;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/a$b;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/a$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/android/billingclient/api/a$b;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/a$b;->b:Ljava/lang/String;

    return-object p0
.end method
