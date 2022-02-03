.class public Lcom/google/android/gms/common/util/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/util/c;


# static fields
.field private static final a:Lcom/google/android/gms/common/util/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/util/d;

    invoke-direct {v0}, Lcom/google/android/gms/common/util/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/util/d;->a:Lcom/google/android/gms/common/util/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/google/android/gms/common/util/c;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/util/d;->a:Lcom/google/android/gms/common/util/d;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
