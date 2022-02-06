.class public final Lcom/android/billingclient/api/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/h$b;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/h;I)I
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/h;->a:I

    return p1
.end method

.method static synthetic b(Lcom/android/billingclient/api/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/h;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static d()Lcom/android/billingclient/api/h$b;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/h$b;-><init>(Lcom/android/billingclient/api/h$a;)V

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lcom/android/billingclient/api/h;->a:I

    return v0
.end method
