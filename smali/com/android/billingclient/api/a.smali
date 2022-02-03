.class public final Lcom/android/billingclient/api/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/a$b;
    }
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

    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/a;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/android/billingclient/api/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static e()Lcom/android/billingclient/api/a$b;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/a$b;-><init>(Lcom/android/billingclient/api/a$a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    return-object v0
.end method
